(function ($) {
	"use strict";

	// Sticky menu 
	var $window = $(window);
	$window.on('scroll', function () {
		var scroll = $window.scrollTop();
		if (scroll < 300) {
			$(".sticky").removeClass("is-sticky");
		} else {
			$(".sticky").addClass("is-sticky");
		}
	});

	// Background Image JS start
	var bgSelector = $(".bg-img");
	bgSelector.each(function (index, elem) {
		var element = $(elem),
			bgSource = element.data('bg');
		element.css('background-image', 'url(' + bgSource + ')');
	});

	// mini cart toggler
	$(".mini-cart-btn").on("click", function (event) {
		event.stopPropagation();
		event.preventDefault();
		$(".cart-list").slideToggle();
		$(".settings-list").slideUp();
	});

	// setting toggler
	$(".settings-btn").on("click", function (event) {
		event.stopPropagation();
		event.preventDefault();
		$(".settings-list").slideToggle();
		$(".cart-list").slideUp();
	});


	// searh option js
	function searchToggler() {
		var trigger = $('.search-trigger'),
			container = $('.search_active');
		trigger.on('click', function (e) {
			e.preventDefault();
			container.toggleClass('is-visible');
		});

		$('.close__wrap').on('click', function () {
			container.removeClass('is-visible');
		});
	}
	searchToggler();


	// Sidebar Category
	var categoryChildren = $('.sidebar-category li .children');
	categoryChildren.slideUp();
	categoryChildren.parents('li').addClass('has-children');
	$('.sidebar-category').on('click', 'li.has-children > a', function (e) {
		if ($(this).parent().hasClass('has-children')) {
			if ($(this).siblings('ul:visible').length > 0) $(this).siblings('ul').slideUp();
			else {
				$(this).parents('li').siblings('li').find('ul:visible').slideUp();
				$(this).siblings('ul').slideDown();
			}
		}
		if ($(this).attr('href') === '#') {
			e.preventDefault();
			return false;
		}
	});


	// responsive menu js
	jQuery('#mobile-menu').meanmenu({
		meanMenuContainer: '.mobile-menu',
		meanScreenWidth: "991"
	});

	// tooltip active js
	$('[data-toggle="tooltip"]').tooltip();


	// Hero main slider active js
	$('.hero-slider-active').slick({
		autoplay: false,
		fade: true,
		prevArrow: '<button type="button" class="slick-prev"><i class="fa fa-angle-left"></i></button>',
		nextArrow: '<button type="button" class="slick-next"><i class="fa fa-angle-right"></i></button>',
		responsive: [{
			breakpoint: 992,
			settings: {
				arrows: false,
				dots: true
			}
		}]
	});
	

	// product carousel 5 col
	$('.product-carousel-5').slick({
		slidesToShow: 5,
		appendArrows: '.slick-append',
		prevArrow: '<button type="button" class="slick-prev"><i class="fa fa-angle-left"></i></button>',
		nextArrow: '<button type="button" class="slick-next"><i class="fa fa-angle-right"></i></button>',
		responsive: [
			{
				breakpoint: 1200,
				settings: {
					slidesToShow: 3
				}
			},
			{
				breakpoint: 768,
				settings: {
					slidesToShow: 2,
					arrows: false
				}
			},
			{
				breakpoint: 480,
				settings: {
					slidesToShow: 1,
					arrows: false
				}
			}
		]
	});

	// product carousel 5 col 2 rows
	$('.product-carousel-10').slick({
		arrows: false,
		rows: 2,
		slidesToShow: 5,
		responsive: [
			{
				breakpoint: 1200,
				settings: {
					slidesToShow: 3
				}
			},
			{
				breakpoint: 768,
				settings: {
					slidesToShow: 2,
					arrows: false
				}
			},
			{
				breakpoint: 480,
				settings: {
					slidesToShow: 1,
					arrows: false
				}
			}
		]
	});

	// product carousel 4 col
	$('.feature-category-carousel').slick({
		arrows: false,
		slidesToShow: 4,
		responsive: [
			{
				breakpoint: 1200,
				settings: {
					slidesToShow: 2,
				}
			},
			{
				breakpoint: 992,
				settings: {
					slidesToShow: 3
				}
			},
			{
				breakpoint: 768,
				settings: {
					slidesToShow: 2
				}
			},
			{
				breakpoint: 480,
				settings: {
					slidesToShow: 1
				}
			}
		]
	});


	// blog carousel active js
	$('.blog-carousel-active').slick({
		arrows: false,
		slidesToShow: 4,
		responsive: [
			{
				breakpoint: 1200,
				settings: {
					slidesToShow: 2
				}
			},
			{
				breakpoint: 576,
				settings: {
					slidesToShow: 1,
					arrows: false
				}
			},
		]
	});

	// prodct details slider active
	$('.product-large-slider').slick({
		slidesToShow: 1,
		slidesToScroll: 1,
		fade: true,
		arrows: false,
		asNavFor: '.pro-nav'
	});

	// product details slider nav active
	$('.pro-nav').slick({
		slidesToShow: 4,
		slidesToScroll: 1,
		asNavFor: '.product-large-slider',
		centerMode: true,
		arrows: false,
		centerPadding: 0,
		focusOnSelect: true
	});

	// Related product active js
	$('.releted-product').slick({
		arrows: false,
		slidesToShow: 3,
		responsive: [
			{
				breakpoint: 992,
				settings: {
					slidesToShow: 2,
					arrows: false,
				}
			},
			{
				breakpoint: 480,
				settings: {
					slidesToShow: 1,
					arrows: false,
				}
			},
		]
	});

	// image zoom effect
	$('.img-zoom').zoom();

	// quantity change js
	$('.pro-qty').prepend('<span class="dec qtybtn">-</span>');
	$('.pro-qty').append('<span class="inc qtybtn">+</span>');
	$('.qtybtn').on('click', function () {
		var $button = $(this);
		var oldValue = $button.parent().find('input').val();
		if ($button.hasClass('inc')) {
			var newVal = parseFloat(oldValue) + 1;
		} else {
			// Don't allow decrementing below zero
			if (oldValue > 0) {
				var newVal = parseFloat(oldValue) - 1;
			} else {
				newVal = 0;
			}
		}
		$button.parent().find('input').val(newVal);
	});

	// nice select active js
	$('select').niceSelect();


	// modal fix
	$('.modal').on('shown.bs.modal', function (e) {
		$('.pro-nav').resize();
	})

	// product view mode change js
	$('.product-view-mode a').on('click', function (e) {
		e.preventDefault();
		var shopProductWrap = $('.shop-product-wrap');
		var viewMode = $(this).data('target');
		$('.product-view-mode a').removeClass('active');
		$(this).addClass('active');
		shopProductWrap.removeClass('grid list').addClass(viewMode);
	})


	// Checkout Page accordion
	$("#create_pwd").on("change", function () {
		$(".account-create").slideToggle("100");
	});

	$("#ship_to_different").on("change", function () {
		$(".ship-to-different").slideToggle("100");
	});


	// Payment Method Accordion
	$('input[name="paymentmethod"]').on('click', function () {
		var $value = $(this).attr('value');
		$('.payment-method-details').slideUp();
		$('[data-method="' + $value + '"]').slideDown();
	});


	// Mailchimp for dynamic newsletter
	$('#mc-form,#nl-form').ajaxChimp({
		language: 'en',
		callback: mailChimpResponse,
		// ADD YOUR MAILCHIMP URL BELOW HERE!
		url: 'https://company.us19.list-manage.com/subscribe/post?u=2f2631cacbe4767192d339ef2&amp;id=24db23e68a'

	});

	// mailchimp active js
	function mailChimpResponse(resp) {
		if (resp.result === 'success') {
			$('.mailchimp-success').html('' + resp.msg).fadeIn(900);
			$('.mailchimp-error').fadeOut(400);

		} else if (resp.result === 'error') {
			$('.mailchimp-error').html('' + resp.msg).fadeIn(900);
		}
	}

	// scroll to top
	$(window).on('scroll', function () {
		if ($(this).scrollTop() > 600) {
			$('.scroll-top').removeClass('not-visible');
		} else {
			$('.scroll-top').addClass('not-visible');
		}
	});
	$('.scroll-top').on('click', function (event) {
		$('html,body').animate({
			scrollTop: 0
		}, 1000);
	});

}(jQuery));