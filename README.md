Expedia Assignment

Problem 1:<br />
POST : http://localhost:8080/product/ <br />
Request Body Sample : <br />
{
    "price":60.0,
    "name":"shampoo"
}
<br />
//It will give all the product having price greater than 50 <br />
GET : http://localhost:8080/product/find?price=50
<br />
<br />
Problem 2: <br />
POST : http://localhost:8080/order/<br />
Request Body Sample : {
    "orderDate":"01-01-2011",
    "customerId":2
}
<br />
GET : http://localhost:8080/order/customer/
<br />
<br />
<br />
Problem 3)<br />
POST : http://localhost:8080/student/
Request Body : {
    "name":"Vipin"
}
POST : http://localhost:8080/student/course/1
Request Body : {
    "courseName":"Java"
}
GET : http://localhost:8080/student/course/Java

Problem 4)
http://localhost:8080/student/

Problem 5)
POST : http://localhost:8080/project/
Request Body : {
    "projectName":"exp-mic",
    "description":"Expedia"
}
POST : http://localhost:8080/project/employee/1
Request Body : {
    "name":"Vipin"
}
