# Lottery Analysis Android App

An Android application that analyzes lottery data and provides insights about number frequency and recommendations.

## Features

1. **Number Frequency Analysis**
   - Given a set of numbers from a user, analyze how often those numbers have appeared in winning sets
   - Support for multiple lottery types (Mega Millions, Powerball, Lotto America, etc.)
   - Historical data tracking and visualization

2. **Smart Number Recommendations**
   - Recommend sets of numbers based on the highest frequency of appearance in winning sets
   - Filter recommendations by:
     - All numbers
     - Specific constraints (e.g., birthday dates)
   - View probability analysis for recommended numbers

## Supported Lotteries

- Mega Millions
- Powerball
- Lotto America
- Gopher 5
- North 5
- Pick 3

## Project Structure

```
app/
├── data/
│   ├── models/          # Data models for lottery data
│   ├── repositories/    # Data access layer
│   └── csv/            # CSV data files
├── ui/
│   ├── fragments/      # UI fragments
│   ├── adapters/       # RecyclerView adapters
│   └── viewmodels/     # ViewModels for data binding
├── analysis/
│   ├── LotteryAnalyzer.kt      # Core analysis logic
│   ├── NumberFrequencyAnalyzer # Frequency calculation
│   └── RecommendationEngine.kt # Recommendation logic
└── utils/
    ├── CSVParser.kt    # CSV parsing utility
    └── DateUtils.kt    # Date utility functions
```

## Getting Started

### Prerequisites
- Android Studio Dolphin or later
- Android SDK 24+
- Kotlin 1.8+

### Installation

1. Clone the repository
2. Open in Android Studio
3. Sync Gradle files
4. Run on emulator or device

## Data Sets

The app uses historical lottery data from the following CSV files:
- `Lottery_Mega_Millions_Winning_Numbers__Beginning_2002.csv`
- `Lottery_Powerball_Winning_Numbers__Beginning_2010.csv`
- `winning_numbers.csv`

## Architecture

- **MVVM Pattern**: Clean separation of UI and business logic
- **Kotlin Coroutines**: Asynchronous data processing
- **LiveData**: Reactive data binding
- **Room Database**: Local caching of lottery data

## Technologies

- Kotlin
- Android Jetpack (ViewModel, LiveData, Room)
- Coroutines
- Material Design 3
- OpenCSV library for data parsing

## License

MIT License

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
