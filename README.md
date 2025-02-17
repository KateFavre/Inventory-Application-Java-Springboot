Kate Favre D287 PA

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
Changed My Bicycle shop to My Guitar Shop on line number 14 in mainscreen.html
Changed Shop to Guitar Shop on line 19 in mainscreen.html
Changed Parts to Guitar Parts on line number 21 in mainscreen.html

(* accidentally hard coded in the code below, I fix it in part E*)
Changed 1 (name) to Strings on line 43 in mainscreen.html
Added lines 51 - 86 to include 4 other parts in mainscreen.html
Changed 1 (name) to Headstock on line 52 in mainscreen.html
Changed 1 (name) to Body on line 52 in mainscreen.html
Changed 1 (name) to Tuning Pegs on line 52 in mainscreen.html
Changed 1 (name) to Guitar Knobs on line 52 in mainscreen.html
Changed Products to Guitar Products on line 89 in mainscreen.html
Changed 1 (name) to Acoustic on line 115 in mainscreen.html
added lines to include 4 more products in mainscreen.html
Changed 1 (name) to Nylon String Acoustic on line 124 in mainscreen.html
Changed 1 (name) to Flying V Electric on line 133 in mainscreen.html
Changed 1 (name) to Gibson Electric on line 142 in mainscreen.html
Changed 1 (name) to Stratocaster Electric on line 151 in mainscreen.html

D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
created a new html page in templates called about.html 
added thymeleaf tag on line 2 in about.html
added required meta tag on line 6 in about.html
added required meta tag for viewport on line 7 in about.html 
added bootstrap css on lines 9 and 10 in about.html
Changed Title to About Page on line 12 in about.html
added a div container for about page body on line 16 in about.html
added an "About Us" header on line 17 in about.html
added nav tag on line 18 in about.html
added ul tag to line 19 in about.html
added li tag with link to mainscreen.html on line 20 in about.html
added li tag with link to about.html on line 21 in about.html
added closing ul tag on line 22 in about.html
added closing nav tag on line 23 in about.html
added a paragraph tag on line 24 in about.html
added about page text on line 25 in about.html 
closed paragraph tag on line 26 in about.html 

created about page controller (AboutController.java) in controllers folder
added @controller annotation on line 8 in AboutController.java
added import statement for controller on line 4 in AboutController.java 
added @GetMapping annotation on line 10 in AboutController.java
added import statement for GetMapping on line 6 in AboutController.java
added method to return about page on lines 11, 12 and 13 in AboutController.java
added ui model import to line 5 in AboutController.java


added nav tag to line 21 in mainscreen.html 
added ul tag to line 22 in mainscreen.html
added li tag with link to mainscreen.html on line 23 in mainscreen.html
added li tag with link to about.html on line 24 in mainscreen.html
added closing ul tag on line 25 in mainscreen.html
added closing nav tag on line 26 in mainscreen.html

added nav ul tag and css on lines 1-7 in demo.css
added nav li margin info on lines 9-11 in demo.css
added nav ul li a info on lines 13-18 in demo.css
added a hover background color on lines 20-22 in demo.css

added link to demo.css on line 11 in about.html
added link to demo.css on line 13 in mainscreen.html



E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

added line 31 in BootStrapData.java to add InhousePartRespository
changed line 34 to include InhousePartRepository in BootStrapData.java
added line 38 in BootStrapData.java to include InhousePartRepository
added line 44 to have if statement to check if partRespository is empty before adding parts in BootStrapData.java


changed line 45 in BootStrapData.java to add new outsourced part called strings
changed line 46 in BootStrapData.java to set part name to Guitar Strings 
changed line 47 in BootStrapData.java to change inventory to 40
changed line 48 in BootStrapData.java to set price to 10
changed line 49 in BootStrapData.java to set Id to 100L
changed line 50 in BootStrapData.java to save string to inhousePartRepository
added lines 52-57 in BootStrapData.java to add headstock to inhousePartRepository
added lines 59-65 to add outsourced part called Body in BootStrapData.java
added lines 67-73 to add outsourced part called Tuning Pegs in BootStrapData.java
added lines 75-81 to add outsourced part called Guitar Knobs in BootStrapData.java

added if statement to line 86 to check if product repo is empty in BootStrapData.java
added lines 87-91 to create 5 new products in BootStrapData.java
added lines 92-96 to save products in BootStrapData.java 

added style to lines 11-34 in about.html instead of linking css (trying to make sure bootstrap css is showing up)
added style to lines 13-36 in mainscreen.html instead of linking css (trying to make sure bootstrap css is showing up)

changed lines 71-115 back to original code in mainscreen.html (I thought part C wanted me to hard code in parts, I realize that was a mistake.)
changed lines 143 - 187 back to original code in mainscreen.html (same thing, thought that part c wanted me to hard code in products.)


F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.

added line 114 in mainscreen.html to include buy now button
create buyNowSuccess.html to indicate success of purchase 
created nuyNowFailure.html to indicate failure of purchase
changed line 5 title in buyNowSuccess.html and buyNowFailure.html to Buy Now Success and Buy Now Failure 
added h1 tag on line 8 in buyNowSuccess.html to display success message
added link on line 9 in buyNowSuccess.html to link to mainscreen.html
added h1 tag on line 8 in buyNowFailure.html to display failure message
added link on line 9 in buyNowFailure.html to link to mainscreen.html
created a BuyProductController to handle request from button in mainscreen.html
added lines 16 and 17 in BuyProductController to inject ProductRepository
added lines 19-21 to Getmapping for /buyProduct in BuyProductController and create optional product variable
added lines 23 - 35 to include if/else statements to check if product inventory is greater than 0 and decrement and return buyNowSuccess if it is. If Product inventory 0 or product not found return buyNowFailure.html


G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

added lines 31-34 in Part.java to add fields and Minimum for Max and Min inventory for parts
changed line 53 in Part.java to add minInv and maxInv to constructor
added lines 49-50 to set default values for maxInv and minInv in Part.java
added lines 18-19 in OutsourcedPart.java to set default for max and min
added lines 18-19 in InhousePart.java to set default for max and min
added lines 58-59 to set default values for maxInv and minInv w additional constructor in Part.java
added lines 92-104 in Part.java to include getters and setters for maxInv and minInv
added lines 50-51, 59-60, 69-70, 79-80, and 89-90 to include max and minimum fields for sample inventory in BootStrapData.java
added lines 24-28 in InhousePartForm.html to include max and min text inputs so user can set the maximum and minimum values.
added lines 25-29 in OutsourcedPartForm.html to include max and min text inputs so user can set the maximum and minimum values.
added lines 67 and 68 to add min and max inv to table headings in mainscreen.html
added line 77 and 78 in mainscreen.html to show min and max inv in table
renamed database to kate_favre_d287_db on line 6 in application.properties
added @max on line 31 in Part.java to make sure inventory is between or at min and max
added @min on line 33 in Part.java to make sure inventory is greater than min 
added @min and @max on lines 35-36 in Part.java to make sure inventory is between min and max

H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

created MinimumValidator.java and ValidMinimum.java to add validation for minimum fields
added lines 11-13 in MinimumValidator to set up custom annotation and @autowired for access to springbeans
lines 15-17 in MinimumValidator.java for optional initialization method
lines 19-22 in MinimumValidator.java logic to check inv is greater than min inv
line 10 ValidMinimum.java link annotation to Validation class
lines 11-12 in ValidMinimum set target (Part class) and makes sure available during runtime 
lines 13-17 in ValidMinimum.java set error message if validation fails 
line 21 added @ValidMinimum to Part.java

added lines 37-38 to EnufPartsValidator.java to check if updating products lowers part inventory below minimum
updated line 20 in ValidEnufParts.java to display error message
added lines 53-56 in ProductServiceImpl.java to display error message if product inventory is lower than min Inv 
added line 27 @ValidEnufParts annotation to AddProductController.java to check if adding or updating product makes part go below min
added line 32 in EnufPartsValidator (was getting errors on running app about myContext and I realized I needed to add assignment)

created MaximumValidator.java and ValidMaximum.java to add validation for maximum fields
added lines 10-12 in MaximumValidator.java to set up custom annotation and @autowired for access to springbeans
lines 14-17 in MaximumValidator.java for optional initialization method
lines 18-21 in MaximumValidator.java logic to check inv is less than or equal to max inv
line 10 ValidMaximum.java link annotation to Validation class
lines 11-12 in ValidMaximum set target (Part class) and makes sure available during runtime
lines 13-17 in ValidMaximum.java set error message if validation fails
line 22 added @ValidMaximum to Part.java

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
lines 30-37 in PartTest.java created test for getMaxInv tested for partIn and partOut
lines 38-45 in PartTest.java created test for setMaxInv tested for partIn and PartOut
lines 46-53 in PartTest.java created test for setMinInv tested for partIn and PartOut
lines 54-61 in PartTest.java created test for setMinInv tested for partIn and PartOut

J.  Remove the class files for any unused validators in order to clean your code.
removed DeletePartValidator.java because it was unused 

*** changed create-drop back to update in application properties


*** updating part H ***
added line 32 in EnufPartsValidator (was getting errors on running app about myContext and I realized I needed to add assignment)
removed @max from lines 35 and line 40 from Part.java (realized it was hard coding a max)
added lines 33-37 in outsourcedPartForm.html to check for validation errors in form and display error messages 
added lines 32-36 in InhousePartForm.html to check for validation errors in form and display error messages 

