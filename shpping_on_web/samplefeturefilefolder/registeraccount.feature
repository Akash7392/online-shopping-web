Feature: User Registration Process

@form
Scenario Outline:Check personal mandatory feilds in registration process end to end
Given enter personal details "<f_name>" and "<L_name>" and "<Paasword>"

Examples:
         |f_name|L_name|Paasword|
         |Kedar|Jadhav|12345th|
         
@form
Scenario Outline:Check address mandatory details feilds in registration process end to end

Given Enter address mandatory details "<First_name>" and "<Last_name>" and "<city>" and "<address>" and "<state>" and "<Zip_code>" and "<country>" and "<mob>" and "<future_ref_add>"

Examples: 
         |First_name|Last_name|city|address|state|Zip code|country|mob|future_ref_add|
         |Kedar|Jadhav|Pune|sadfuli park|Arizona|522555|United States|98974563214|sand joke|

 @form1  
Scenario Outline:Check non mandatory feilds in registration process end to end
Given click on title radio button mr and mrs
And   Enter the date of birth
And   Click on check boxes sign up and receive special offer
And   Enter the company name "<com_name>" and Address linetwo "<Address_linetwo>" and "<Additional_info>"
And   Click on register process

Examples:
         |com_name|Address_linetwo|Additional_info|
         |capji|behind persona funishijng|Additional_info|   
         
 
@accountvalidation        
Scenario: Verify invalid email adress error message   
Given Verify invalid email adress error

       
         
         
         