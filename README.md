# meal-planner
Basic JDBC application using postgreSQL driver.

The application lets the user save meals to a database. The meal 
fals under a sertain category (breakfast, lunch, dinner), it has 
a name and consists of a set of ingredients. When a meal entry is 
added to the database, the meal is given a unique ID (integer), and
is saved in the table "meals". The ingredients that go with the spesific
meal are saved in i different table, but the table also saves the meal ID
the spesific ingredients belong to. Each ingredient entry is given its own
ID-number. If the same ingredient is already in the table, the new
ingredient entry will be given the same ingredient ID as the previous
entries. 

The user is presented with 5 options:

add: This option inserts a new meal entry into the database. 

show: Lists all the meal entries by category (breakfast, lunch, dinner).

plan: Lets the user create a meal plan for the whole week (monday-sunday). 
      The user is presented with a list of potential meals (previous meal
      enries) sorted by category, and can pick between them. When the plan
      is created, it will be listed in the console window, and added to the 
      table "plan". 
      When the user wants to create a new plan, i entries in the table will 
      be deleted, and the new meal plan will take its place. 
      
save: Lets the user create a shopping list for all the ingredients needed to
      make every meal in the table "meals". The list will be printed to a
      file. 
