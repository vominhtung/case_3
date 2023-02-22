
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <meta name="description" content=""/>
    <meta name="author" content=""/>
        <head>
        <title>Customer Manager</title>

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
            <h1 class="mt-4"> Hiển thị thong tin nhân viên
            </h1>
            <div class="card mb-4">
                <div class="card-header">
                    <i class="fas fa-table mr-1"></i>
                </div>
                <div class="card-body">
                    <div class="table-responsive">
                        <div class = "card-body">
                            <h1> Hiển thị thông tin nhân viên</h1>
                        <table border="1" class="table table-bordered" id="dataTable" width="100%" cellspacing="0">

                            <thead>
                            <tr style="text-align: center">
                                <th>Id</th>
                                <th>name</th>
                                <th>address</th>
                                <th>phone</th>
                                <th>position</th>
                                <th>salary</th>
                                <th>Start date</th>
                                <th>Action</th>
                            </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>${staff.id} </td>
                                    <td>${staff.name} </td>
                                    <td>${staff.address}</td>
                                    <td>${staff.phone}</td>
                                    <td>${staff.position}</td>
                                    <td>${staff.salary}</td>
                                    <td>${staff.startDate}</td>
                                    <td style="text-align: center">
                                        <!-- them sua xoa -->
                                        <a href="<c:url value="/staff/edit"/>?id=${staff.id}" class="btn btn-sm btn-primary">
                                            <i class="fas fa-pen-square"></i>Sửa
                                        </a>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        </div>
    </main>
</div>
</head>
</html>
</html>