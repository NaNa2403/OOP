package lab9.part4.ex3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();

        System.out.println("===Country===");
        System.out.println(CountryArrayManager.codeOfCountriesToString(countryManager.getCountries()));
        //[NZL CHN DNK NLD IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU ARG DZA CAN AUS KAZ SGP ESP SWE THA UKR VNM FRA GBR ITA CHE QAT]

        System.out.println("\n===Sort Increasing By Population===");
        testSortIncreasingByPopulation();
        //[QAT NZL DNK SGP CHE SWE NLD KAZ AUS CAN UKR DZA ARG ESP ITA FRA GBR THA DEU VNM JPN MEX RUS BGD BRA NGA PAK IDN USA IND CHN]

        System.out.println("\n===Sort Decreasing By Population===");
        testSortDecreasingByPopulation();
        //[CHN IND USA IDN PAK NGA BRA BGD RUS MEX JPN VNM DEU THA GBR FRA ITA ESP ARG DZA UKR CAN AUS KAZ NLD SWE CHE SGP DNK NZL QAT]

        System.out.println("\n===Sort Increasing By Area===");
        testSortIncreasingByArea();
        //[SGP QAT CHE NLD DNK BGD GBR NZL ITA VNM DEU JPN SWE ESP THA FRA UKR PAK NGA IDN MEX DZA KAZ ARG IND AUS BRA USA CHN CAN RUS]

        System.out.println("\n===Sort Decreasing By Area===");
        testSortDecreasingByArea();
        //[RUS CAN CHN USA BRA AUS IND ARG KAZ DZA MEX IDN NGA PAK UKR FRA THA ESP SWE JPN DEU VNM ITA NZL GBR BGD DNK NLD CHE QAT SGP]

        System.out.println("\n===Sort Increasing By GDP===");
        testSortIncreasingByGdp();
        //[PAK IND BGD NGA VNM DZA UKR IDN BRA THA MEX ARG KAZ RUS CHN ESP ITA FRA JPN GBR NZL CAN DEU QAT AUS SWE NLD SGP DNK USA CHE]

        System.out.println("\n===Sort Decreasing By GDP===");
        testSortDecreasingByGdp();
        //[CHE USA DNK SGP NLD SWE AUS QAT DEU CAN NZL GBR JPN FRA ITA ESP CHN RUS KAZ ARG MEX THA BRA IDN UKR DZA VNM NGA BGD IND PAK]

        System.out.println("\n===Africa Countries===");
        testFilterAfricaCountry();
        //[NGA DZA]

        System.out.println("\n===Asia Countries===");
        testFilterAsiaCountry();
        //[CHN IND IDN PAK BGD JPN KAZ SGP THA VNM QAT]

        System.out.println("\n===Europe Countries===");
        testFilterEuropeCountry();
        //[DNK NLD RUS DEU ESP SWE UKR FRA GBR ITA CHE]

        System.out.println("\n===North America Countries===");
        testFilterNorthAmericaCountry();
        //[USA MEX CAN]

        System.out.println("\n===Oceania Countries===");
        testFilterOceaniaCountry();
        //[NZL AUS]

        System.out.println("\n===South America Countries===");
        testFilterSouthAmericaCountry();
        //[BRA ARG]

        System.out.println("\n===2 Most populated Countries===");
        testFilterMostPopulousCountries();
        //[CHN IND]

        System.out.println("\n===2 Least populated Countries===");
        testFilterLeastPopulousCountries();
        //[QAT NZL]

        System.out.println("\n===2 Largest Countries===");
        testFilterLargestAreaCountries();
        //[RUS CAN]

        System.out.println("\n===2 Smallest Countries===");
        testFilterSmallestAreaCountries();
        //[SGP QAT]

        System.out.println("\n===2 Highest GDP Countries===");
        testFilterHighestGdpCountries();
        //[CHE USA]

        System.out.println("\n===2 Lowest GDP Countries===");
        testFilterLowestGdpCountries();
        //[PAK IND]
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }

                String code = dataList.get(0);
                String name = dataList.get(1);
                int population = Integer.parseInt(dataList.get(2));
                double area = Double.parseDouble(dataList.get(3));
                double gdp = Double.parseDouble(dataList.get(4));
                String continent = dataList.get(5);

                if (continent.equals("Africa")) {
                    countryManager.append(new AfricaCountry(code, name, population, area, gdp));
                } else if (continent.equals("Asia")) {
                    countryManager.append(new AsiaCountry(code, name, population, area, gdp));
                } else if (continent.equals("Europe")) {
                    countryManager.append(new EuropeCountry(code, name, population, area, gdp));
                } else if (continent.equals("North America")) {
                    countryManager.append(new NorthAmericaCountry(code, name, population, area, gdp));
                } else if (continent.equals("Oceania")) {
                    countryManager.append(new OceaniaCountry(code, name, population, area, gdp));
                } else if (continent.equals("South America")) {
                    countryManager.append(new SouthAmericaCountry(code, name, population, area, gdp));
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }

        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "src/lab9/part4/ex3/data/countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.println(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortDecreasingByPopulation() {
        Country[] countries = countryManager.sortByDecreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortIncreasingByArea() {
        Country[] countries = countryManager.sortByIncreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortDecreasingByArea() {
        Country[] countries = countryManager.sortByDecreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortIncreasingByGdp() {
        Country[] countries = countryManager.sortByIncreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortDecreasingByGdp() {
        Country[] countries = countryManager.sortByDecreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterAfricaCountry() {
        Country[] countries = countryManager.filterAfricaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterAsiaCountry() {
        Country[] countries = countryManager.filterAsiaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterEuropeCountry() {
        Country[] countries = countryManager.filterEuropeCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterNorthAmericaCountry() {
        Country[] countries = countryManager.filterNorthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterOceaniaCountry() {
        Country[] countries = countryManager.filterOceaniaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterSouthAmericaCountry() {
        Country[] countries = countryManager.filterSouthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterMostPopulousCountries() {
        Country[] countries = countryManager.filterMostPopulousCountries(2);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterLeastPopulousCountries() {
        Country[] countries = countryManager.filterLeastPopulousCountries(2);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterLargestAreaCountries() {
        Country[] countries = countryManager.filterLargestAreaCountries(2);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterSmallestAreaCountries() {
        Country[] countries = countryManager.filterSmallestAreaCountries(2);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterHighestGdpCountries() {
        Country[] countries = countryManager.filterHighestGdpCountries(2);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterLowestGdpCountries() {
        Country[] countries = countryManager.filterLowestGdpCountries(2);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }
}
