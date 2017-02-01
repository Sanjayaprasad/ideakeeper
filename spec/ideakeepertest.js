
var webdriver = require('selenium-webdriver'),
    By = require('selenium-webdriver').By,
    until = require('selenium-webdriver').until;

var driver = new webdriver.Builder().forBrowser('chrome').build();

driver.get('http://localhost:3000');
driver.findElement(By.id('text')).sendKeys('welcome to solutionsiq');
driver.findElement(By.id('click')).click();
driver.quit();