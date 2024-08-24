Go to project directory and run the following commands
1. mvn clean install
2. cd target
3. java -jar makersharks-0.0.1-SNAPSHOT.jar
4. Go to http://localhost:8080/h2-console (username = sa, password = )
5. Execute sql commands given below -

    
insert into suppliers (supplier_id, company_name, location, website, business_nature, manufacturing_process) values (1, 'amazon', 'bangalore', 'amazon.com', 'LARGE_SCALE', 'PRINTING_3D');

insert into suppliers (supplier_id, company_name, location, website, business_nature, manufacturing_process) values (2, 'google', 'bangalore', 'google.com', 'MEDIUM_SCALE', 'PRINTING_3D');

insert into suppliers (supplier_id, company_name, location, website, business_nature, manufacturing_process) values (3, 'facebook', 'delhi', 'facebook.com', 'SMALL_SCALE', 'PRINTING_3D');

select * from suppliers;

6. Run curl command or hit api endpoint in postman
   
  CMD -

  curl --location "http://localhost:8080/api/supplier/query" --data "{\"location\": \"Saharanpur\", \"businessNature\": \"MEDIUM_SCALE\", \"manufacturingProcess\": \"PRINTING_3D\"}"

PowerShell -

  curl --location 'http://localhost:8080/api/supplier/query' --data '{"location": "Saharanpur", "businessNature": "MEDIUM_SCALE", "manufacturingProcess": "PRINTING_3D"}'

Linux/Mac -

curl --location 'http://localhost:8080/api/supplier/query' --data '{"location": "Saharanpur", "businessNature": "MEDIUM_SCALE", "manufacturingProcess": "PRINTING_3D"}'
