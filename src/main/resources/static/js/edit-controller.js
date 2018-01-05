pegawaiApp.controller('EditController', 
    function($scope, $http, $window) {

        $scope.pegawai = {};

        $scope.load = function() {
            var data = $window.location.search.split("&");
            for(i=0; i<data.length; i++) {
                console.log(data[i]);
                switch(i) {
                    case 0: $scope.pegawai.id = data[i].split("=")[1];
                    case 1: $scope.pegawai.nama = data[i].split("=")[1];
                    case 2: $scope.pegawai.jabatan = data[i].split("=")[1];
                }
            }
        }

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

        $scope.load();

});