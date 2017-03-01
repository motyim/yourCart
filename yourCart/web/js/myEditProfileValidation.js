function validate()
{
	var flagPassword=validatePassword();
	var flagCredit=validateCredit();
	if(flagPassword==true&&flagCredit==true)
	{
		//	alert("geh kolo true");
		return true;
	}
	else
	{
		//	alert("geh false");
		return false;
	}
}

function validatePassword()
{
	var pass=document.getElementById("editPassword").value;
	var confirmPass=document.getElementById("editConfirmPassword").value;
	if(pass==confirmPass)
	{
		return true;
	}
	else
	{
		document.getElementById("errorPassword").style.display='block';
		return false;
	}
}

function validateCredit()
{
	var credit=document.getElementById("editCreditCard").value;
	var CreditCardPattern=/^([0-9]{4}( |\-)){3}[0-4]{4}$/;
	if(credit.match(CreditCardPattern))
	{
		console.log(credit.match(CreditCardPattern));
		return true;
	}
	else{
		document.getElementById("errorCredit").style.display='block';
		return false;
	}
}