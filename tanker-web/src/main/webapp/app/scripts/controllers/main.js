'use strict';

angular.module('tankerApp').controller('MainCtrl', function ($scope, Container) {

    $scope.listContainers = function () {
        Container.getAllContainers($scope.includeOffline, function (containers) {
            $scope.containers = containers;
            if ($scope.container == undefined) {
                $scope.inspectContainer(containers[0].Id);
            }
        });
    };

    $scope.inspectContainer = function (containerIds) {
        $scope.container = undefined;
        Container.inspectContainers(containerIds, function (containers) {
            $scope.container = containers[0];
        });
    };

    $scope.startContainer = function (containerIds) {
        Container.startContainers(containerIds);
    };

    $scope.stopContainer = function (containerIds) {
        Container.stopContainers(containerIds);
    };

    $scope.restartContainer = function (containerIds) {
        Container.restartContainers(containerIds);
    };

    $scope.removeContainer = function (containerIds) {
        Container.removeContainers(containerIds);
    };

    $scope.killContainer = function (containerIds) {
        Container.killContainers(containerIds);
    };

    $scope.listContainers();

});
