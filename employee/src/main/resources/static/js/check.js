	function doSubmit(){
		var errTag = document.getElementById("err");
	
		 errTag.innerHTML ="";
		 document.employeeForm.empNo.style.backgroundColor = "white";
		 document.employeeForm.name.style.backgroundColor = "white";
		 
		 var empNo = document.employeeForm.empNo.value;
		 var name = document.employeeForm.name.value;
		 
		 var errorMessages = [];
		 if(empNo == ""){
			errorMessages.push("社員番号を入力してください。");
			document.employeeForm.empNo.style.backgroundColor = "red";
		}
		if(name == ""){
			errorMessages.push("社員名を入力してください。");
			document.employeeForm.name.style.backgroundColor = "red";
		}
		if(errorMessages.length >0){
			var msg = errorMessages.join("<br>") ;
			errTag.innerHTML = msg;
			return false;
		}
	}