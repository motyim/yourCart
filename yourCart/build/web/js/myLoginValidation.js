function validateSignup()
{
    var message = "" ; 
    
    if(!validatePassword()){
        message += "* passwords not match <br>";
    }
    
    if(!validateCredit()){
        message += "* Wrong Credit card number Must be in form 8888-8888-8888-8888<br>";
    }
    
    if(message)
    {
        document.getElementById("error").style.display = "block";
        document.getElementById("error").innerHTML = message; 
        return false;
    }
    else return true;
   
   
}
function validatePassword()
{

    var pass = document.getElementById("SignupPassword").value;
    var confirmPass = document.getElementById("SignupConfirmPassword").value;
    var comparePass = pass.localeCompare(confirmPass);
    return comparePass === 0 ;
}

function validateCredit()
{
    var credit = document.getElementById("SignupCreditCard").value;
    var CreditCardPattern = /^([0-9]{4}( |\-)){3}[0-9]{4}$/;
    return credit.match(CreditCardPattern);

}
		