This is a ecommerce site with Spring application.


Specifications:
1. UI - Angular 12, Bootstrap, jQuery, Typescript
2. Server - Java Spring boot application
3. DB - Mysql ready but not connected.

Project Hierarchy:
                        Parent - Ecomm - Master gradle project
                        
              Child 1                               Child 2
             commissioner                         ecommerce-simple
       (a java spring boot server)    (an angular project with gradle installed)

Steps to build project:

  1. cd ecomm
  2. build ecomm with STS
  3. run commissioner project
  4. cd ecommerce-simple
  5. npm start
  
  
  
  API Endpoints :
  
  /inventory
    Returns all inventory items. - GET
  /inventory/1
    Returns inventory item with id 1. - GET
  /inventory/add
    Add an item -POST
  /inventory/update/1
    updates item with id 1 -PUT
  /inventory/delete/1
    deletes an item with id as 1 -DELETE
    
