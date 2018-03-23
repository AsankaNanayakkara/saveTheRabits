$(document).ready(function () {
    $('#donation-form').validate({
        submitHandler: function (form) {
            var obj = new Object();
            obj.donatorName = $("input#donatorName").val();
            obj.email = $("input#Email").val();
            obj.phone = $("input#Phone").val();
            obj.amount = $("input#Amount").val();
            var jsonString = JSON.stringify(obj);
            $.ajax({
                type: 'POST',
                url: '/saveTheRabits/WS/donations/add',
                contentType: 'application/json',
                data: jsonString,
                success: function () {
                    $('#msgBlock').addClass("success").html('Donation is successfully added');
                    $('#dataTable').bootstrapTable('refresh');

                    $("input#donatorName").val('');
                    $("input#Email").val('');
                    $("input#Phone").val('');
                    $("input#Amount").val('');
                },
                error: function () {
                    $('#msgBlock').addClass("error").html('Donation is successfully added');
                }
            });
        }
    });
})