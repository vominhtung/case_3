<%--
  Created by IntelliJ IDEA.
  User: VÕ Minh Tùng
  Date: 2/17/2023
  Time: 5:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>trang 1</title>
    <link href="../style.css" rel="stylesheet"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <style>
        body {
            margin: 0;
            font-family: Arial, Helvetica, sans-serif;
            /*position: absolute;*/
        }

        .topnav {
            width: 100%;
            overflow: hidden;
            background-color: #333;
            position: fixed;
        }

        .topnav a {
            float: left;
            color: #f2f2f2;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
            font-size: 17px;
        }

        .topnav a:hover {
            background-color: #ddd;
            color: black;
        }

        .topnav a.active {
            background-color: #4CAF50;
            color: white;
        }
        .row{

        }

    </style>
    <div class="topnav" style="padding-right: 10px">
        <a href="/staffs" >Quay lại</a>

    </div>
</head>
<div id="layoutSidenav_content">
    <main>
        <div class="container-fluid">
            <h1 class="mt-4"> Thêm nhân viên mới</h1>
            <div class="card mb-4">
                <div class="card-header">
                    <i class="fas fa-table mr-1"></i>
                </div>
<div class = "card-body">
    <h1> Thêm nhân viên mới</h1>

    <form action="<c:url value="/staff/add"/>" method="post">
        <table border="1" cellpadding=" 5">

            <tr>
                <th>Id</th>
                <td>
                    <input type="text" name ="id" id="id" size="40"/>
                </td> </tr>
            <tr>
                <th>name</th>
                <td>
                    <input type="text" name="name" id="name" size="40"/>
                </td>
            </tr>
            <tr>
                <th>address</th>
                <td>
                    <input type="text" name="address" id="address" size="40"/>
                </td>
            </tr>
            <tr>
                <th>salary</th>
                <td>
                    <input type="text" name="salary" id="salary" size="40"/>
                </td>
            </tr>
            <tr>
                <th>position</th>
                <td>
                    <input type="text" name="position" id="position" size="40"/>
                </td>
            </tr>
            <tr>
                <th>start_date</th>
                <td>
                    <input type="text" name="start_date" id="start_date" size="40"/>
                </td>
            </tr>
            <tr>
                <th>phone</th>
                <td>
                    <input type="text" name="phone" id="phone" size="40"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>        </div>
        </div>
    </main>
</div>
</html>


