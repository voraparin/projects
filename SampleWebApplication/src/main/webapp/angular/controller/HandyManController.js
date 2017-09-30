'use strict';


/*var CarpentryInfoController = function($scope){
	
	alert("inside controller");
}
*/

app.controller('HandyManController', function($scope, $http, $sce){
	alert("controller for HandyMan");
	
	//var coa_url = 'http://www.viudadesoubrier.com/angular/model.php';
	/*var coa_url = 'http://oasis/oasiscs/creditonaccount.asp?totalrefund=1&customerid=1';
	//var coa_url = 'http://oasis/oasiscs/dummy.asp';
	//var coa_url = 'https://www.yahoo.com'
	
	$scope.test = function(){
		
		 $http.jsonp($sce.trustAsResourceUrl(coa_url))
	        .then(function success(json) {
	           // $scope.response = json.data.data;
	        	alert("hiiii");
	        }).then(function failure(){
				alert("COA Failure");
			});
		
		$http({
			method: "GET",
			url: coa_url
		}).then(function success(response){
			alert(response.status);
		}).then(function failure(){
			alert("COA Failure");
		})
	}*/
	
})