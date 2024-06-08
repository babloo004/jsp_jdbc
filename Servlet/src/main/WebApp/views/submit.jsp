<%@page language="java" %>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link rel="stylesheet" type="text/css" href="styles.css">
    </head>
    <body>
        <form action="submit" method="post">
            <label for="sid">Enter Student roll number  : </label>
            <input type="text" id="sid" name="sid"><br>
            <label for="first_name">Enter First Name  : </label>
            <input type="text" id="first_name" name="first_name"><br>
            <label for="last_name">Enter Last Name   : </label>
            <input type="text" id="last_name" name="last_name"><br>
            <label for="marks">Enter Marks   : </label>
            <input type="text" id="marks" name="marks"><br>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>