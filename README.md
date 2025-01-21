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
file name:
line number:
change:

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
file name:
line number:
change:


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