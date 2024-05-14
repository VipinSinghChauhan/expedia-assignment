**Expedia Assignment**

**Problem 1**:<br/>
// Add product <br/>
POST : http://localhost:8080/product/ <br />
Request Body Sample : <br />
{
    "price":60.0,
    "name":"shampoo"
}

//It will give all the product having price greater than 50 <br />
GET : http://localhost:8080/product/find?price=50
<br />
<br />
**Problem 2**: <br />
// Add order <br/>
POST : http://localhost:8080/order/<br />
Request Body Sample : {
    "orderDate":"01-01-2011",
    "customerId":2
}
<br />
GET : http://localhost:8080/order/customer/ <br/>
OUTPUT : [
{
"customerId": 2,
"orderCount": 6
},
{
"customerId": 1,
"orderCount": 3
},
{
"customerId": 3,
"orderCount": 1
}
]
<br />
<br />
**Problem 3)**<br />
// Create a student <br/>
POST : http://localhost:8080/student/<br/>
Request Body : {
    "name":"Vipin"
}<br/>
// Create a course <br/>
POST : http://localhost:8080/student/course/1<br/>
Request Body : {
    "courseName":"Java"
}<br/>
// Get all the students having course Java <br/>
GET : http://localhost:8080/student/course/Java<br/><br/>
**Problem 4**)<br/>
// Get all the students with their courses <br/>
http://localhost:8080/student/
<br/><br/>
**Problem 5**)<br/>
// Create a project <br/>
POST : http://localhost:8080/project/<br/>
Request Body : {
    "projectName":"exp-mic",
    "description":"Expedia"
}<br/>
// Create a Employee <br/>
POST : http://localhost:8080/project/employee/1<br/>
Request Body : {
    "name":"Vipin"
}<br/>
Get all the Employees having project exp-mic <br/>
GET : http://localhost:8080/project/employee?project_name=exp-mic <br/>
