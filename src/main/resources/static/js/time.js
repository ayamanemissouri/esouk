function makeTimer() {

			var endTime = new Date("April 12, 2020 17:00:00 PDT");
			var endTime = (Date.parse(endTime)) / 1000;

			var now = new Date();
			var now = (Date.parse(now) / 1000);

			var timeLeft = endTime - now;

			var days = Math.floor(timeLeft / 86400); 
			var hours = Math.floor((timeLeft - (days * 86400)) / 3600);
			var minutes = Math.floor((timeLeft - (days * 86400) - (hours * 3600 )) / 60);
			var seconds = Math.floor((timeLeft - (days * 86400) - (hours * 3600) - (minutes * 60)));

			if (hours < "10") { hours = "0" + hours; }
			if (minutes < "10") { minutes = "0" + minutes; }
			if (seconds < "10") { seconds = "0" + seconds; }

			$("#days").html(days + "<span class='span d-inline-block count-up'></span></i>");
			$("#hours").html(hours + "<span  class='span d-inline-block count1'></span></i>");
			$("#minutes").html(minutes + "<span  class='span d-inline-block count2'></span></i>");
			$("#seconds").html(seconds + "<span  class='span d-inline-block count3'></span></i>");

	}

	setInterval(function() { makeTimer(); }, 1000);