pegawaiApp.controller('TambahController', 
    function($scope, $http, $window) {
        $scope.simpan = function() {
            $http.post("/api/tambah", $scope.pegawai).then(sukses, gagal);

            function sukses(response) {
                $window.location.href = "/";    
            }

            function gagal(response) {}
        }

        $scope.batal = function() {
            $window.location.href = "/";
        }
    }
);