function isPlusNumber (str){
	var len = str.length;
	for(var i = 0; i< len ; i++){
		var c = str.charAt(i);
		if(c<'0' ||c>'9' ){
			return false;
		}
	return true;
	}
	
}