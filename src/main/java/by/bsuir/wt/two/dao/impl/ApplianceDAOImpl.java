package by.bsuir.wt.two.dao.impl;

import by.bsuir.wt.two.dao.parser.Parser;
import by.bsuir.wt.two.dao.parser.XMLParser;
import by.bsuir.wt.two.entity.Appliance;
import by.bsuir.wt.two.dao.ApplianceDAO;
import by.bsuir.wt.two.entity.criteria.Criteria;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

/**
 * Data access object class to appliance entities
 *
 * @author Ivan Riabov
 */
public class ApplianceDAOImpl implements ApplianceDAO {

    private static final String WAREHOUSE_PATH = "/warehouse_database.xml";

    @Override
    public List<Appliance> find(Criteria criteria) {
        Parser parser = new XMLParser();
        try {
            parser.parse(WAREHOUSE_PATH);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

        return parser.take(criteria);
    }


}