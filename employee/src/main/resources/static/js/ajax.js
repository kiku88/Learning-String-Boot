	function getXHR(){
		var req;
		try{
			req = new XMLHttpRequest();
		}catch(e){
			try{
				req = new ActiveXObject('Msxml2.XMLHTTP');
			} catch(e){
				req = new ActiveXObject('Microsoft.XMLHTTP');
			}
		}
		return req;
	}
	function dynamicEmpSearch(){

		var elem = document.getElementById("emp");

		if(document.employeeForm.empNo.value.length != 4){
			elem.innerHTML = "";
			return;
		}
		req = getXHR();
		req.onreadystatechange = function(){
			if(req.readyState == 4 && req.status == 200){
				try{
					var obj = JSON.parse(req.responseText);
					if(obj.empNo == ""){
						elem.style.color = "green";
						elem.innerHTML = "OK";
					}
					else{
						elem.style.color = "red";
						elem.innerHTML = "社員番号" + obj.empNo + "は" + obj.name + "さんとして既に登録されています。";
					}
				}
				catch(e){
				}
			}
			else{
				elem.innerHTML = "";
			}
		}
		req.open("GET", "employeeSearchJson?empNo=" + document.employeeForm.empNo.value);
		req.send(null);
	}
 	window.onload = function(){
 		document.employeeForm.empNo.onkeyup = function(){
 			dynamicEmpSearch();
 		};
 	}

