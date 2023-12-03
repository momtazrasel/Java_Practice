public class MultipleTextAssert {
    public static void main(String[] args) {
        /***
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage with your elements
        driver.get("https://example.com");

        // Define the common locator for all elements
        By locator = By.xpath("//your/xpath/here");

        // Get all elements with the specified locator
        java.util.List<WebElement> elements = driver.findElements(locator);

        // Define expected texts in an array
        String[] expectedTexts = {"Text1", "Text2", "Text3", "Text4", "Text5", "Text6", "Text7", "Text8", "Text9", "Text10"};

        // Iterate over the elements and assert their texts
        for (int i = 0; i < elements.size(); i++) {
            WebElement element = elements.get(i);
            String actualText = element.getText();
            String expectedText = expectedTexts[i];

            // Perform assertion (you can use your preferred assertion library)
            if (actualText.equals(expectedText)) {
                System.out.println("Element " + (i + 1) + " text is correct: " + actualText);
            } else {
                System.out.println("Element " + (i + 1) + " text is incorrect. Expected: " + expectedText + ", Actual: " + actualText);
            }
        }

        // Close the browser
        driver.quit();
         ***/
    }
}
