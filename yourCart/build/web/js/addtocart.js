$(document).ready(function () {

    //add in home & shop page
    $('.add-to-cart').click(function () {
        var id = $(this).attr('id');
        addProduct(id,1);
    });

    //add from product details
     $('.add-to-my').click(function () {
        var id = $(this).attr('id');
        var qaunty = $("#quan").val();
        alert(id +" "+qaunty);
        addProduct(id,qaunty);
    });

    // add product to cart
    function addProduct(id ,qaunty) {
        $.ajax({
            url: 'addCart', //servlet url
            type: 'GET',
            data: {"productID": id,"qaunty" :qaunty },
            success: (data) => {
                $("#number").html(data);
            }
        });
    }
});