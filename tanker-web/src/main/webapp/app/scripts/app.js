'use strict';

angular.module('tankerApp', ["containerSrv"])
    .config(function ($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: '/app/views/main.html',
                controller: 'MainCtrl'
            })
            .otherwise({
                redirectTo: '/'
            });
    });
