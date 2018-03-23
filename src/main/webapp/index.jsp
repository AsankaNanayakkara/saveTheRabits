<%--
  Created by IntelliJ IDEA.
  User: Asanka Nanayakkara
  Date: 20/03/2018
  Time: 02:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script language="JavaScript" type="text/javascript" src="js/jquery-2.2.4.js"></script>
    <script language="JavaScript" type="text/javascript" src="js/jquery.validate.js"></script>
    <script language="JavaScript" type="text/javascript" src="js/bootstrap-table.js"></script>
    <script language="JavaScript" type="text/javascript" src="js/donation.js"></script>
    <link rel="stylesheet" href="css/donations.css" type="text/css">
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="css/bootstrap-table.css" type="text/css">
</head>
<body>
<form id="donation-form" method="post">
<table style="width:40%" align="center">
    <br>
    <tr>
        <td colspan="3" align="center"><h3>Donations for Save the Rabits</h3></td>
    </tr>
    <tr>
        <td colspan="3" align="center"><div id="msgBlock">&nbsp;</div></td>
    </tr>
    <tr class=".mt-2">
        <td width="33%" align="right">Name&nbsp;&nbsp;</td>
        <td width="66%"><input type="text" name="donatorName" id="donatorName" aria-describedby="donatorName" placeholder="Enter name" required maxlength="40"></td>
    </tr>
    <tr class=".mt-2">
        <td width="33%" align="right">Email&nbsp;&nbsp;</td>
        <td width="66%"><input type="text" name="Email" id="Email" aria-describedby="Email" placeholder="Enter email" required></td>
    </tr>
    <tr class=".mt-2">
        <td width="33%" align="right">Phone&nbsp;&nbsp;</td>
        <td width="66%"><input type="text" name="Phone" id="Phone" aria-describedby="Phone" placeholder="Enter phone" required></td>
    </tr>
    <tr class=".mt-2">
        <td width="33%" align="right">Amount&nbsp;&nbsp;</td>
        <td width="66%"><input type="text" name="Amount" id="Amount" aria-describedby="Amount" placeholder="Enter amount" required></td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td><input type="Submit" name="Submit" value="Submit"></td>
    </tr>
</table>
<div class="tableWrap">
    <table id="dataTable" data-pagination="true" data-search="true" data-toggle="table" data-url="/saveTheRabits/WS/donations/get">
        <thead>
        <tr>
            <th data-sortable="true" data-field="donatorName">Name</th>
            <th data-field="email">Email</th>
            <th data-field="phone">Phone</th>
            <th data-field="amount">Amount</th>
        </tr>
        </thead>
    </table>
</div>
</form>
</body>
</html>
