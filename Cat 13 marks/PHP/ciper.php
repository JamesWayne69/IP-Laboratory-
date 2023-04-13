<html>
    <head> 
        <title> Ceasar Answer </title>
    </head>
    <body>
        <?php 
            $plaintext = "$_GET("text")";
            $key = intval($_GET("key"));
            //$plaintext = "ABCD";
            //$key = 3;
            $cipher = "";
            for($i=0;$i<strlen($plaintext);$i++) {
                $c = $plaintext[$i];
                if(ctype_lower($c))
                    echo chr((ord($plaintext[$i])-$key-ord("a")+26)%26+ord("a"));
                else if(ctype_alpha($c))
                    echo chr((ord($plaintext[$i])-$key-ord("A")+26)%26+ord("A"));
                else
                    echo $plaintext[$i];
            }
        ?>
    </body>
</html>
            
        