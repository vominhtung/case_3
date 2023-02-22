
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>trang 2</title>
    <link href="../style.css" rel="stylesheet"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <style>
        body {
            margin: 0;
            font-family: Arial, Helvetica, sans-serif;
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
    </style>
    <div class="topnav" style="padding-right: 10px">
        <a href="/staffs" >Quay lại</a>

    </div>
</head>
<div id="layoutSidenav_content">
    <main>
        <div class="container-fluid">
            <h1 class="mt-4">  Sữa thông tin nhân viên</h1>
            <div class="card mb-4">
                <div class="card-header">
                    <i class="fas fa-table mr-1"></i>
                </div>
                <center>

                </center>
                <div class = "card-body">
                    <h1>  Sữa thông tin nhân viên</h1>
<center>
    <div class = "card-body">
        <form begin="<c:url value="/staff/edit"/>" method="post">
 </center>
        <table border="1" cellpadding=" 5">
            <tr><th>name</th>
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
        </table>
    </form>
</div>
            </div>
        </div>
    </main>
</div>
</html>


