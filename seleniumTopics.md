#### Selenium
#### Differance between findElement & findElements:
##### findElement() method:
   findElement method is used to access single web element on a page. It returns the first matching element. It throws a "NoSuchElementException" exception when it fails to find out the such element.
   #### Syntax: driver.findElement(By.xpath("Value of Xpath"));
   
##### findElements() method:
   findElements method returns the all matching elements. The findElements method returns the empty list, when the element is not available or doesn't exist on the page. It doesn't throw "NoSuchElementException".
   #### Syntax: List link=driver.findElement(By.xpath("Value of Xpath"));
