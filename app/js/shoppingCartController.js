'use strict';

var shoppingCartControllers = angular.module('shoppingCartControllers', ['shoppingCartServices']);

shoppingCartControllers.controller('showShoppingCartController', ['$scope', 'shoppingCartServices', '$location', '$rootScope','$routeParam',
    function ($scope, $http, $location, $rootScope,shoppingCartServices,$rootParams) {
        var id =$rootParams.id;
        shoppingCartServices.get({id:id},function(data){
            $scope.cart = data;
        })
        $scope.$on('$locationChangStart',function(event){
            $rootScope.cartUpdateSuccess = false;
        });
        $scope.updateCart = function(){
            shoppingCartServices.update({id:id},$scope.cart,function(){
                $rootScope.cartUpdateSuccess = true;
            })
        }
        $scope.totalEach = function(index){
            return $scope.cart.selectedProducts[index].product.totalprice*$scope.cart.selectedProducts[index].amount;
        }
        $scope.total = function(){
            var total = 0;
            angular.forEach($scope.cart.selectedProducts,function(item){
                total += item.amount*item.product.totalPrice;
            })
            return total;
        }


    }]);