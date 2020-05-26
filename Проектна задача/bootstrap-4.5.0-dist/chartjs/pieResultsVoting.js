// Pie Chart Example
var ctx = document.getElementById('pieResultsVoting').getContext('2d');
var myChart = new Chart(ctx, {
  type: 'pie',
  data: {
    labels: ['Левица', 'ВМРО-ДПМНЕ', 'СДСМ', 'Обединети за Македонија'],
    datasets: [{
      data: [45, 30, 22, 3],
      backgroundColor: [
        '#02B875',
        '#A997DF',
        '#648CAC',
        '#ff8785'
      ],
      borderWidth: 5
    }]
  }
});