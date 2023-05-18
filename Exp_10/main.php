<html>
    <head>
        <title>PHP DB OPERATIONS</title>
    </head>
    <body>
        <form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
            Name: <input type="text" name="name">
            <span class="error">* <?php echo $name_error;?></span>
            <br><br>
            Age: <input type="text" name="age">
            <span class="error">* <?php echo $age_error;?></span>
            <br><br>
            <input type="submit" name="submit" value="Submit">
        </form>

        <?php

            $name_regex = "/^[a-zA-Z ]*$/";
            $age_regex = "/^[1-9][0-9]*$/";

            if ($_SERVER["REQUEST_METHOD"] == "POST") {

                $name = test_input($_POST["name"]);
                $age = test_input($_POST["age"]);

                if (!preg_match($name_regex, $name)) {
                    $name_error = "Invalid name format. Only letters and white space allowed.";
                }

                if (!preg_match($age_regex, $age)) {
                    $age_error = "Invalid age format. Only numbers allowed and age should be greater than 0.";
                }

                if (empty($name_error) && empty($age_error)) {
                    $servername = "localhost";
                    $username = "root";
                    $password = "ayano@104";
                    $dbname = "ip_lab";

                    $conn = new mysqli($servername, $username, $password, $dbname);

                    if ($conn->connect_error) {
                    die("Connection failed: " . $conn->connect_error);
                    }

                    $stmt = $conn->prepare("INSERT INTO characters (name, age) VALUES (?, ?)");
                    $stmt->bind_param("si", $name, $age);

                    $stmt->execute();

                    echo "Data inserted successfully";

                    $stmt->close();
                    $conn->close();
                    exit();
                }
            }

            function test_input($data) {
                $data = trim($data);
                $data = stripslashes($data);
                $data = htmlspecialchars($data);
                return $data;
            }
        ?>

    </body>
</html>

