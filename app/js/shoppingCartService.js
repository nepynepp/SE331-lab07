/**
 * Created by HH on 2016/3/26.
 */
'use strict'
var shoppingCartServices = angular.module('shoppingCartServices', ['ngResource']);
shoppingCartServices.factory('shoppingCartService', function ($resource) {
    return $resource('http://localhost:8080/shoppingcart/:id', {id: '@_id'}, {
        update: {
            method: 'PUT' // this method issues a PUT request
        }
    });

})




