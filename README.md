Kate Favre D287 PA

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
Changed My Bicycle shop to My Guitar Shop on line number 14 in mainscreen.html
Changed Shop to Guitar Shop on line 19 in mainscreen.html
Changed Parts to Guitar Parts on line number 21 in mainscreen.html
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
changed line 64 in BootStrapData.java to add acoustic guitar product to sample inventory
changed line 65 in BootStrapData.java to add nylon string acoustic product to sample inventory
added line 66 in BootStrapData.java to add Flying V Electric product to sample inventory
added line 67 in BootStrapData.java to add Gibson Electric product to sample inventory
added line 68 in BootStrapData.java to add Stratocaster Electric product to sample inventory
changed line 69 in BootStrapData.java to save acoustic guitar product
changed line 70 in BootStrapData.java to save nylon string acoustic product
added line 71 in BootStrapData.java to save Flying V Electric product
added line 72 in BootStrapData.java to save Gibson Electric product
added line 73 in BootStrapData.java to save Stratocaster Electric product
added line 63 in BootStrapData.java to make sure productRepository is empty before adding sample inventory 
added line 74 closing braces for if statement starting on line 63 in BootStrapData.java

added if statement on line 42 in BootStrapData.java to make sure outsourcedPartsRepository is empty before adding sample inventory 
changed line 43 in BootStrapData.java to add new outsourced part called Strings
changed line 44 in BootStrapData.java to set company name to Guitar Shop
changed line 45 in BootStrapData.java to set part name to Guitar Strings 
changed line 46 in BootStrapData.java to change inventory to 40
changed line 45 in BootStrapData.java to set price to 10
changed line 48 in BootStrapData.java to set Id to 100L

changed line 50 in BootStrapData.java to add new outsourced part called headstock
changed line 51 in BootStrapData.java to set company name to Guitar Shop
changed line 52 in BootStrapData.java to set part name to Headstock
changed line 53 in BootStrapData.java to change inventory to 15
changed line 54 in BootStrapData.java to set price to 40
changed line 55 in BootStrapData.java to set Id to 101L

changed line 57 in BootStrapData.java to add new outsourced part called body
changed line 58 in BootStrapData.java to set company name to Guitar Shop
changed line 59 in BootStrapData.java to set part name to body
changed line 60 in BootStrapData.java to change inventory to 30
changed line 61 in BootStrapData.java to set price to 60
changed line 62 in BootStrapData.java to set Id to 102L

changed line 64 in BootStrapData.java to add new outsourced part called tuningPegs
changed line 65 in BootStrapData.java to set company name to Guitar Shop
changed line 66 in BootStrapData.java to set part name to Tuning Pegs
changed line 67 in BootStrapData.java to change inventory to 50
changed line 68 in BootStrapData.java to set price to 40
changed line 69 in BootStrapData.java to set Id to 103L

changed line 71 in BootStrapData.java to add new outsourced part called guitarKnobs
changed line 72 in BootStrapData.java to set company name to Guitar Shop
changed line 73 in BootStrapData.java to set part name to GuitarKnobs
changed line 74 in BootStrapData.java to change inventory to 50
changed line 75 in BootStrapData.java to set price to 30
changed line 76 in BootStrapData.java to set Id to 104L




F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.
file name:
line number:
change:

G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.
file name:
line number:
change:

H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.
file name:
line number:
change:

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
file name:
line number:
change:

J.  Remove the class files for any unused validators in order to clean your code.
file name:
line number:
change: