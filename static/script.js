// Function to fetch marks and display them in the table
async function fetchMarks() {
  const apiUrl = 'http://localhost:8080/api/marks/fetchMarks'; // Update with your backend API URL
  try {
    const response = await fetch(apiUrl); // Call the API
    if (!response.ok) {
      throw new Error(`HTTP error! status: ${response.status}`);
    }
    const marks = await response.json(); // Parse JSON response
    populateTable(marks); // Populate the table with data
  } catch (error) {
    console.error('Error fetching marks:', error);
    alert('Failed to fetch marks. Please check the console for details.');
  }
}

// Function to populate the table
function populateTable(marks) {
  const tableBody = document.querySelector('#marks-table tbody');
  tableBody.innerHTML = ''; // Clear existing table rows

  // Loop through the data and create table rows
  marks.forEach(mark => {
    const row = document.createElement('tr');
    row.innerHTML = `
      <td>${mark.studentName}</td>
      <td>${mark.subjectName}</td>
      <td>${mark.marks}</td>
    `;
    tableBody.appendChild(row);
  });
}

// Attach event listener to the button
document.getElementById('fetch-btn').addEventListener('click', fetchMarks);
