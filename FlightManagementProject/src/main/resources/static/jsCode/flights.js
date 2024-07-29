document.addEventListener('DOMContentLoaded', function() {
    fetch('/api/flights')
    .then(response => response.json())
    .then(data => {
        const tbody = document.getElementById('flights-tbody');
        data.forEach((flight, index) => {
            const row = document.createElement('tr');
            row.innerHTML = `
                <td>${index + 1}</td>
                <td>${flight.airline}</td>
                <td>${flight.flightNumber}</td>
                <td>${flight.tripType}</td>
                <td>${flight.departureAirport}</td>
                <td>${flight.arrivalAirport}</td>
                <td>${flight.departureDate}</td>
                <td>${flight.arrivalDate}</td>
                <td class="actions">
                    <button class="edit-btn" onclick="editFlight(${flight.id})">Edit</button>
                    <button class="delete-btn" onclick="deleteFlight(${flight.id})">Delete</button>
                </td>
            `;
            tbody.appendChild(row);
        });
    })
    .catch(error => {
        console.error('Error fetching flight data:', error);
    });
});

function editFlight(flightId) {
    alert('Edit flight with ID: ' + flightId);

}

function deleteFlight(flightId) {
    if (confirm('Are you sure you want to delete this flight?')) {
        fetch(`/api/flights/${flightId}`, {
            method: 'DELETE'
        })
        .then(response => {
            if (response.ok) {
                alert('Flight deleted successfully!');
                location.reload();
            } else {
                alert('Failed to delete flight.');
            }
        })
        .catch(error => {
            console.error('Error deleting flight:', error);
            alert('An error occurred while deleting the flight.');
        });
    }
}