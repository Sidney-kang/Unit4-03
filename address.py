# Created by : Sidney Kang
# Created on : 29 Oct. 2017
# Created for : ICS3UR
# Daily Assignment - Unit4-03
# This program accepts an address and formats it nicely

def print_address(apt_number, st_address, city, province, postal_code):
    if apt_number == "": 
       print(st_address + ", " + city + ", " + province + ", " + postal_code)   
    elif apt_number == "redo":
       print("Please type 'yes' or 'no'")
       setup()
       return 
    else:
       print(apt_number + ", " + st_address + ", " + city + ", " + province + ", " + postal_code) 
def setup():      
    apt_number = raw_input("Would you like to enter your apartment number (yes or no): ")
    if apt_number == "yes":
       apt_number = raw_input("Please enter your apartment number: ")
       st_address = raw_input("Please enter your street address: ")
       city = raw_input("Please enter the city you live in: ")
       province = raw_input("Please enter the province you live in: ")
       postal_code = raw_input("Please enter you postal code: ")
       print_address(apt_number, st_address, city, province, postal_code)
    elif apt_number == "no":
       apt_number = ""
       st_address = raw_input("Please enter your street address: ")
       city = raw_input("Please enter the city you live in: ")
       province = raw_input("Please enter the province you live in: ")
       postal_code = raw_input("Please enter you postal code: ")
       print_address(apt_number, st_address, city, province, postal_code)  
    else: 
       apt_number = "redo"
       st_address = ""
       city = ""
       province = ""
       postal_code = ""
       print_address(apt_number, st_address, city, province, postal_code)
       
setup()
