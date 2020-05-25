// Pie Chart Example
var ctx = document.getElementById('pieResultsVoting').getContext('2d');
var myChart = new Chart(ctx, {
  type: 'pie',
  data: {
    labels: ['Партија број 1', 'Партија број 2', 'Партија број 3'],
    datasets: [{
      data: [42, 33, 25],
      backgroundColor: [
        '#02B875',
        '#A997DF',
        '#648CAC'
      ],
      borderWidth: 5
    }]
  }
});