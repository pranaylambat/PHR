<?php
if (isset($_POST["btnLogin"])) {
    $username = getParam("txtUsername");
    $password = getParam("txtPassword");
    $sql_select = "SELECT * FROM `tbl_student` WHERE `txtEmailId` LIKE '$username' AND `txtPassword` LIKE '$password'";
    $object = mysql_fetch_assoc(mysql_query($sql_select));
    if (!empty($object)) {
        $_SESSION = $object;
        header("location:index.php?page=home");
    } else {
        $indexLogin = "Check username and password !!!";
    }
}
?>

<div style="padding: 10px;width: 100%">
    <div style="width: 50%;float: left">
        <div >
            <img src="fotos/pic02.JPG" style="float: left;margin-right: 10px;"/> 
            <p style="line-height: 20px;">
            <h2>Welcome to college name</h2>
            <br>
            <p style="text-align: justify">
                Nagpur Institute of Technology (NIT) is situated on Nagpur-Katol Road,   Nagpur in the state of Maharashtra, and is located in picturesque green   campus, sets up an ideal environment for pursuing excellence in   engineering &amp; technical education. Having started in the year 2008,   our aim is to develop into a leading Engineering Institute for high   quality education and research in engineering and technology
            </p>
        </div>
    </div>
    <div  style="width: 46%;float: right;border: solid 0px;">
        <form name="frmLogin" id="frmLogin" method="post">
            <div id="wrapper" style="min-height: 200px;width: 400px;border-radius:5px;">
                <div id="header" >
                    <center><h3 style="color: white;line-height: 35px;margin-left: 8px;">WELCOME TO COLLEGE FEEDBACK SYSTEM PLEASE LOG-IN </h3></center>
                </div>
                <center>
                    <table >
                        <tr><td colspan="2">&nbsp;</td></tr>
                        <tr>
                            <td class="label">USERNAME&nbsp;:&nbsp;&nbsp;</td>
                            <td><input type="email" required="" minlength="3" maxlength="30" autofocus="" name="txtUsername" value="<?php echo $txtUsername ?>"></td>
                        </tr>
                        <tr>
                            <td class="label">PASSWORD&nbsp;:&nbsp;&nbsp;</td>
                            <td><input  required="" minlength="3" maxlength="10"  type="password" name="txtPassword" ></td>
                        </tr>
                        <tr>
                            <td  align="right" colspan="2">
                                <input type="submit" value="Login" name="btnLogin" class="button">
                            </td>
                            <td  align="right" colspan="2">
                                <input type="submit" value="FORGET PASSWORD" name="btnLogin" class="button">
                            </td>
                        </tr>
                        <?php if (!empty($indexLogin)) { ?>
                            <tr><td colspan="2" align="center" style="color: red"><?php echo $indexLogin ?></td></tr>
                        <?php } ?>
                    </table>
                </center>
            </div>
        </form>
    </div>
</div>
<div style="clear: both"></div>