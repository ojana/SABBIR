function verify()
            {
                 var a = document.getElementById("uid").value;
                 var b = document.getElementById("pass").value;
                  
                   if(a == "" && b == "")
                   {
                        alert("Forgot to enter User ID and Passwrd");
                   }
                   else if (a =="")
                  {
                        confirm("Enter User ID");
                  }
                   else if(b =="")
                  {
                        prompt("forgot password")
                  }
                  


            }