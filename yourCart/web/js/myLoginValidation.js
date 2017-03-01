function validateSignup()
	{
		var flagPassword=validatePassword();
		var flagCredit=validateCredit();
		if((flagPassword==true)&&(flagCredit==true))
		{
		//alert("geh kolo true");
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
			
			var pass=document.getElementById("SignupPassword").value;
			var confirmPass=document.getElementById("SignupConfirmPassword").value;
			var comparePass=pass.localeCompare(confirmPass);
			if(comparePass==0)
			{
			//	alert("dkhlt fl compare");
					console.log(comparePass);
					return true;
			}
			else
			{
			//	alert("dkhlt fl compare wromg");
				document.getElementById("errorPassword").style.display='block';
				return false;
				
			}
		}
		function validateCredit()
		{
			var credit=document.getElementById("SignupCreditCard").value;
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
		