<html>
    <head>
        <title> Character Origins</title>
        <link rel = "stylesheet" href = "styles.css">
    </head>
    <body>
        <div>
        <h1> Character Origins</h1>
        <form method="get">
            <label for="char">Character Name:</label>
            <input type="text" name="char">
            <button type="submit">Submit</button>
          </form>
        </div>

        <div>
          <?php
          if (isset($_GET['Games'])) {
          
            $charId = $_GET['Games'];
            $xml = simplexml_load_file('char.xml');
            $charData = $xml->xpath("//char[charid=" . $charId . "]");
          
          if (!empty($charData)) {
            foreach ($charData as $char) {
              echo "charname: " . $char->charname . "<br>";
              echo "Age: " . $char->age . "<br>";
              echo "First Appearance: " . $char->first . "<br>";
              echo "Status: " . $char->status . "<br>";

            }
          } else
              echo "Character data not found.";
          }

          ?>

        </div>
    </body>
</html>
