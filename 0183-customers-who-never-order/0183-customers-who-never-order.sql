/* Write your T-SQL query statement below */
select Customers.name as Customers from Customers full join orders on Orders.customerId = Customers.id where  customerId is null;