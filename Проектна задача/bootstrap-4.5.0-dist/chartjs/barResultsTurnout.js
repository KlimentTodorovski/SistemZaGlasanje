// Set new default font family and font color to mimic Bootstrap's default styling
Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
Chart.defaults.global.defaultFontColor = '#292b2c';

// Bar Chart Example
var ctx = document.getElementById("barResultsTurnout");
var myLineChart = new Chart(ctx, {
    type: 'bar',
    data: {
        labels: ["Скопје", "Неготино", "Кочани", "Македонска Каменица",  "Кавадарци", "Битола", "Охрид"],
        datasets: [{
            label: "Излезеност во проценти",
            backgroundColor: "#17a2b8",
            borderColor: "#17a2b8",
            data: [32, 25, 27, 31, 25, 57, 44],
        }],
    },
    options: {
        scales: {
            xAxes: [{
                gridLines: {
                    display: false
                }
            }],
            yAxes: [{
                ticks: {
                    min: 0,
                    max: 100
                }
            }],
        },
        legend: {
            display: false
        }
    }
});