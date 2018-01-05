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

        $scope.tambah = function() {
            $window.location.href = "/tambah-ui";
        }

        $scope.edit = function(pegawai) {
            $window.location.href = "/edit-ui?id=" + pegawai.id +
                    "&nama=" + pegawai.nama +
                    "&jabatan=" + pegawai.jabatan;
        }

        $scope.delete = function(pegawai) {
            $http.delete("/api/delete/" + pegawai.id).then(sukses, gagal);

            function sukses(response) {
                $scope.updateDaftar();
            }

            function gagal(response) {}
        }

        $scope.updateDaftar();
    }
);