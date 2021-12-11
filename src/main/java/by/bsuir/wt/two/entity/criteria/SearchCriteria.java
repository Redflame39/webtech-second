package by.bsuir.wt.two.entity.criteria;

/**
 * The type Search criteria.
 */
public final class SearchCriteria {

    /**
     * The enum Oven.
     */
    public static enum Oven{
        /**
         * Price oven.
         */
        PRICE,
        /**
         * Power consumption oven.
         */
        POWER_CONSUMPTION,
        /**
         * Weight oven.
         */
        WEIGHT,
        /**
         * Capacity oven.
         */
        CAPACITY,
        /**
         * Depth oven.
         */
        DEPTH,
        /**
         * Height oven.
         */
        HEIGHT,
        /**
         * Width oven.
         */
        WIDTH
    }
    public static enum Laptop{
        /**
         * Price laptop.
         */
        PRICE,
        /**
         * Battery capacity laptop.
         */
        BATTERY_CAPACITY,
        /**
         * Os laptop.
         */
        OS,
        /**
         * Memory rom laptop.
         */
        MEMORY_ROM,
        /**
         * System memory laptop.
         */
        SYSTEM_MEMORY,
        /**
         * Cpu laptop.
         */
        CPU,
        /**
         * Display inches laptop.
         */
        DISPLAY_Inches
    }

    /**
     * The enum Refrigerator.
     */
    public static enum Refrigerator{
        /**
         * Price refrigerator.
         */
        PRICE,
        /**
         * Power consumption refrigerator.
         */
        POWER_CONSUMPTION,
        /**
         * Weight refrigerator.
         */
        WEIGHT,
        /**
         * Freezer capacity refrigerator.
         */
        FREEZER_CAPACITY,
        /**
         * Overall capacity refrigerator.
         */
        OVERALL_CAPACITY,
        /**
         * Height refrigerator.
         */
        HEIGHT,
        /**
         * Width refrigerator.
         */
        WIDTH
    }

    /**
     * The enum Vacuum cleaner.
     */
    public static enum VacuumCleaner{
        /**
         * Price vacuum cleaner.
         */
        PRICE,
        /**
         * Power consumption vacuum cleaner.
         */
        POWER_CONSUMPTION,
        /**
         * Filter type vacuum cleaner.
         */
        FILTER_TYPE,
        /**
         * Bag type vacuum cleaner.
         */
        BAG_TYPE,
        /**
         * Wand type vacuum cleaner.
         */
        WAND_TYPE,
        /**
         * Motor speed regulation vacuum cleaner.
         */
        MOTOR_SPEED_REGULATION,
        /**
         * Cleaning width vacuum cleaner.
         */
        CLEANING_WIDTH
    }

    /**
     * The enum Tablet pc.
     */
    public static enum TabletPC{
        /**
         * Price tablet pc.
         */
        PRICE,
        /**
         * Battery capacity tablet pc.
         */
        BATTERY_CAPACITY,
        /**
         * Display inches tablet pc.
         */
        DISPLAY_INCHES,
        /**
         * Memory rom tablet pc.
         */
        MEMORY_ROM,
        /**
         * Flash memory capacity tablet pc.
         */
        FLASH_MEMORY_CAPACITY,
        /**
         * Color tablet pc.
         */
        COLOR
    }

    /**
     * The enum Speakers.
     */
    public static enum Speakers{
        /**
         * Price speakers.
         */
        PRICE,
        /**
         * Power consumption speakers.
         */
        POWER_CONSUMPTION,
        /**
         * Number of speakers speakers.
         */
        NUMBER_OF_SPEAKERS,
        /**
         * Frequency range speakers.
         */
        FREQUENCY_RANGE,
        /**
         * Cord length speakers.
         */
        CORD_LENGTH
    }


    private SearchCriteria() {}
}
