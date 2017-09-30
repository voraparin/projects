'use strict';

var app = angular.module('LocalExpert', ['ngRoute','ngResource']);

app.config(['$routeProvider', '$locationProvider', '$httpProvider', function($routeProvider, $locationProvider, $httpProvider){
	/*alert("this is a test page");
	$locationProvider.html5Mode(false);*/
	$routeProvider.when('/handyman',{
		title : 'hire a handy man',
		templateUrl : 'handyman',
		controller : 'HandyManController'
	}).when('/projects',{
		title : 'home improvement projects',
		templateUrl : 'projects',
		controller : 'ProjectsController'
	}).when('/contactus',{
		title : 'Contact us',
		templateUrl : 'contactus',
		controller : 'ContactUsController'
	})
}]);