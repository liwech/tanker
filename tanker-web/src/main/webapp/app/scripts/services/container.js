angular.module('containerSrv', []).

    factory('Container', function ($http) {
        return {

            getAllContainers: function (includeOffline, callback) {
                includeOffline = (_.isUndefined(includeOffline)) ? false : includeOffline;
                var containers = [];
                $http.get("/containers?includeOffline=" + includeOffline).success(function (response) {
                    angular.forEach(response, function (value) {
                        containers.push(value);
                    });
                    if (!_.isUndefined(callback)) {
                        callback(containers);
                    }
                });
                return containers;
            },

            inspectContainers: function (containerIds, callback) {
                var containers = [];
                $http.get("/containers/inspect/" + containerIds).success(function (response) {
                    angular.forEach(response, function (value) {
                        containers.push(value);
                    });
                    if (!_.isUndefined(callback)) {
                        callback(containers);
                    }
                });
                return containers;
            },

            startContainers: function (containerIds, callback) {
                $http.get("/containers/start/" + containerIds).success(function (response) {
                    if (!_.isUndefined(callback)) {
                        callback(response);
                    }
                });
            },

            stopContainers: function (containerIds, callback) {
                $http.get("/containers/stop/" + containerIds).success(function (response) {
                    if (!_.isUndefined(callback)) {
                        callback(response);
                    }
                });
            },

            restartContainers: function (containerIds, callback) {
                $http.get("/containers/restart/" + containerIds).success(function (response) {
                    if (!_.isUndefined(callback)) {
                        callback(response);
                    }
                });
            },

            removeContainers: function (containerIds, callback) {
                $http.get("/containers/remove/" + containerIds).success(function (response) {
                    if (!_.isUndefined(callback)) {
                        callback(response);
                    }
                });
            },

            killContainers: function (containerIds, callback) {
                $http.get("/containers/kill/" + containerIds).success(function (response) {
                    if (!_.isUndefined(callback)) {
                        callback(response);
                    }
                });
            }

        }
    });