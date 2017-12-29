pegawaiApp.controller('DaftarController', 
    function($scope, $http, $window) {
        $scope.daftarPegawai = [];

        $scope.updateDaftar = function() {
            $http.get("/get-daftar-pegawai").then(sukses, gagal);

            function sukses(response) {
                $scope.daftarPegawai = response.data;
            }

            function gagal(response) {}
        };

        $scope.updateDaftar();
    }
);